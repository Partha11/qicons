package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.Forward: ImageVector
    get() {
        if (_Forward != null) {
            return _Forward!!
        }
        _Forward = ImageVector.Builder(
            name = "Outlined.Forward",
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
                moveTo(3f, 8.689f)
                curveToRelative(0f, -0.864f, 0.933f, -1.406f, 1.683f, -0.977f)
                lineToRelative(7.108f, 4.061f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.954f)
                lineToRelative(-7.108f, 4.061f)
                arcTo(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 16.811f)
                verticalLineTo(8.69f)
                close()
                moveTo(12.75f, 8.689f)
                curveToRelative(0f, -0.864f, 0.933f, -1.406f, 1.683f, -0.977f)
                lineToRelative(7.108f, 4.061f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.954f)
                lineToRelative(-7.108f, 4.061f)
                arcToRelative(1.125f, 1.125f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.683f, -0.977f)
                verticalLineTo(8.69f)
                close()
            }
        }.build()

        return _Forward!!
    }

@Suppress("ObjectPropertyName")
private var _Forward: ImageVector? = null
