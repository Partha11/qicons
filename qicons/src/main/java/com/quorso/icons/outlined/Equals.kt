package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Equals: ImageVector
    get() {
        if (_Equals != null) {
            return _Equals!!
        }
        _Equals = ImageVector.Builder(
            name = "Outlined.Equals",
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
                moveTo(4.499f, 8.248f)
                horizontalLineToRelative(15f)
                moveToRelative(-15f, 7.501f)
                horizontalLineToRelative(15f)
            }
        }.build()

        return _Equals!!
    }

@Suppress("ObjectPropertyName")
private var _Equals: ImageVector? = null
