package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Bars2: ImageVector
    get() {
        if (_Bars2 != null) {
            return _Bars2!!
        }
        _Bars2 = ImageVector.Builder(
            name = "Outlined.Bars2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.75f, 9f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 6.75f)
                horizontalLineToRelative(16.5f)
            }
        }.build()

        return _Bars2!!
    }

@Suppress("ObjectPropertyName")
private var _Bars2: ImageVector? = null
