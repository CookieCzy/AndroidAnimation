/*
 * Copyright (C) 2015 YangEdward
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edward.com.animation.effects;

public abstract class NoDirection implements Effect4View {

    protected long duration = AnimatorBuilder.DEFAULT_DURATION;
    protected int repeatCount;

    protected NoDirection() {
    }

    protected NoDirection(long duration) {
        this.duration = duration;
    }

    public NoDirection setDuration(long duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public long getDuration() {
        return duration;
    }
}
