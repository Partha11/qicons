package com.quorso.icons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.quorso.icons.QIcons

val QIcons.Outlined.CheckBadge: ImageVector
    get() {
        if (_CheckBadge != null) {
            return _CheckBadge!!
        }
        _CheckBadge = ImageVector.Builder(
            name = "Outlined.CheckBadge",
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
                moveTo(9f, 12.75f)
                lineTo(11.25f, 15f)
                lineTo(15f, 9.75f)
                moveTo(21f, 12f)
                curveToRelative(0f, 1.268f, -0.63f, 2.39f, -1.593f, 3.068f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.043f, 3.296f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.296f, 1.043f)
                arcTo(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                curveToRelative(-1.268f, 0f, -2.39f, -0.63f, -3.068f, -1.593f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.296f, -1.043f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.043f, -3.296f)
                arcTo(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                curveToRelative(0f, -1.268f, 0.63f, -2.39f, 1.593f, -3.068f)
                arcToRelative(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.043f, -3.296f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.296f, -1.043f)
                arcTo(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                curveToRelative(1.268f, 0f, 2.39f, 0.63f, 3.068f, 1.593f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.296f, 1.043f)
                arcToRelative(3.746f, 3.746f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.043f, 3.296f)
                arcTo(3.745f, 3.745f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                close()
            }
        }.build()

        return _CheckBadge!!
    }

@Suppress("ObjectPropertyName")
private var _CheckBadge: ImageVector? = null
